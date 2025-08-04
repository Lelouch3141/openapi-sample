package com.example.demo;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.ResponseEntity;

import com.example.api.UserApi;
import com.example.model.Gender;
import com.example.model.User;
public class Users implements UserApi{
	/**
     * ユーザーデータを保持するインメモリのデータストア（データベースの代わり）
     * Key: ユーザーID, Value: Userオブジェクト
     */
    private final Map<Integer, User> userMap = new ConcurrentHashMap<>();
    
    private final AtomicInteger idCounter = new AtomicInteger(0);
	
	
    /**
     * GET /users/{id} : ユーザー詳細取得 の実装
     *
     * @param id ユーザーID (パスパラメータ)
     * @return 指定されたIDのユーザー情報を返却
     */
    @Override
    public ResponseEntity<User> getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("John F Kennedy");
        user.setEmail("john@example.com");
        user.setAge(46);
        user.setGender(Gender.male); // 0: 男性

        // HTTPステータス200 (OK)
        return ResponseEntity.ok(user);
    }
    
    /**
     * POST /users : ユーザー登録 の実装
     *
     * @param user リクエストボディのユーザー情報
     * @return 
     */
    @Override
    public ResponseEntity<User> createUser(User user) {
        // @Validアノテーションにより、Userモデルの制約(例: @NotNull)に基づいたバリデーションが自動的に行われる
    	
        // 新しいIDを採番
        int newId = idCounter.incrementAndGet();
        user.setId(newId);

        // Mapにユーザーを追加
        userMap.put(newId, user);
        System.out.println("ユーザーを追加しました: " + user);

        URI location = org.springframework.web.servlet.support.ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        // .created()でLocationヘッダーを設定
        // .body()でレスポンスボディにuserオブジェクトを設定
        return ResponseEntity.created(location).body(user);
    }
}
