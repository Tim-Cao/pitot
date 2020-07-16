## Service and LocalService

- Normally the Service calls LocalService

- Service checks permissions

 - LocalService doesn't check permissions

 - Try to use LocalService
 
 - In some cases where check permissions, use Service instead of LocalService
 
 - Call persistence directly in the same module or kernal
 
       Avoid using this except it is quite necessary
