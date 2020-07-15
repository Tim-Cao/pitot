## Service and LocalService

- Normally the Service calls LocalService

- Service checks permissions

 - LocalService doesn't check permissions

 - Try to use LocalService
 
 - In some cases where check permissions, use Service instead of LocalService
 
 - Avoid calling persistence from kernal directly in modules
