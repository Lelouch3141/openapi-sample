# User


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | ユーザーID | [optional] [default to undefined]
**name** | **string** | 氏名 | [default to undefined]
**email** | **string** | メールアドレス | [default to undefined]
**gender** | [**Gender**](Gender.md) |  | [optional] [default to undefined]
**age** | **number** | 年齢 | [optional] [default to undefined]

## Example

```typescript
import { User } from './api';

const instance: User = {
    id,
    name,
    email,
    gender,
    age,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
