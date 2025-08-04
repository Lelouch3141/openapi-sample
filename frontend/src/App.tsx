// src/components/UserList.tsx
import React, { useEffect, useState } from 'react';
import { Configuration, UserApi } from '../generated';
import type { User } from '../generated';

const UserList = () => {
  const [users, setUsers] = useState<User[]>([]);
  const [error, setError] = useState<string | null>(null);

  const token = 'token-123456';

  useEffect(() => {
    const config = new Configuration({
      basePath: 'http://localhost:8080',
      accessToken: token
    });
    const api = new UserApi(config);

    api.getUsers()
      .then((response) => {
        setUsers(response.data);
      })
      .catch((err) => {
        setError(err.message ?? 'error');
      });
  }, []);

  if (error) return <p>エラー: {error}</p>;

  return (
    <div>
      <h2>ユーザー一覧</h2>
      <ul>
        {users.map((user) => (
          <li key={user.id}>
            {user.name} : {user.email} : {user.gender}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UserList;
