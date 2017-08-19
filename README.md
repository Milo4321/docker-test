##### Docker JEE test project

1 WebApp:

http://localhost:8080/infoshare/index.html
http://localhost:8080/infoshare/welcome

2 JAX-RS

http://localhost:8080/infoshare/api/hello
http://localhost:8080/infoshare/api/users/1

post JSON:

http://localhost:8080/infoshare/api/users

body:

{
"id":1,
"name":"exampleName"
}


3 DB files volume binding (host):

/opt/data
