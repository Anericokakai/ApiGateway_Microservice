# using the service name 
> enable first the api gateway to search for  the service
> using ``spring.cloud.gateway.discovery.locator.enabled=true`` in oder to access the end point using
> ``http://localhost:8089/SHOP-SERVICE/v2/api/shops/new``
> 

## to use lowercase 
> if we want to use lower case name for our api call
>  we need this property
> ``
spring.cloud.gateway.discovery.locator.lower-case-service-id=true``
> 
> 