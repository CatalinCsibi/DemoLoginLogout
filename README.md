Simple Login application with Spring Security

Demo Login application with:
Two Entities AppUser and Role.
Two Repositories UserRepository and RoleRepository. 
Two services, UserService and RoleService.
One RestController, UserController.

UserController has Get Requests and Post Requests.
Some requests are available for user with ROLE_USER and other for users
with ROLE_ADMIN (check SecurityConfig for authorities).

I am using PostgresSQL for my database. Also, I am using
CommandLineRunner to add a few objects in the database when the application 
starts running.
I have added 3 roles (ROLE_USER, ROLE_ADMIN, ROLE_MANAGER) and 3 users.
All of this can be seen in the application main class.

When we login, 2 tokens are generated, an access_token and a refresh_token.
The access token needs to be used afterwards to access different endpoints, based on the
authority that the user has.

I have also added a Collection of requests in resources, that can be imported in postman.







