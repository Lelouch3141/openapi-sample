# IgnoreApi

All URIs are relative to *http://localhost:8080*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**dummy**](#dummy) | **GET** /_references/dummy | dummy|

# **dummy**
> Greeting dummy()

型定義の参照用のpath定義。

### Example

```typescript
import {
    IgnoreApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new IgnoreApi(configuration);

const { status, data } = await apiInstance.dummy();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**Greeting**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

