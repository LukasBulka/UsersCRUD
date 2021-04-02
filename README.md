# UsersCRUD
IT school workshop project. A simple web application for user management.

## General purpose
This MVC based app allows you to create and manage users data involving Tomcat container for Java Servlets and JSPs covered with a nice and friendly SB Admin 2 template.

## Technologies and tools used
* JDBC
* MySQL
* JBCrypt
* Http Servlets
* SB Admin2 theme
* JSP
* Expression Language
* JSTL
* InteliJ IDEA

## User entity content
Model and data access layers based on [UserDao](https://github.com/LukasBulka/UserDao) project.
  
## Functionalities
Available endpoints:
* .../user/list       - *lists all created users*
* .../user/add        - *creates new user*
* .../user/show?id=   - *shows details of user with given ID*
* .../user/edit?id=   - *edits user with given ID*
* .../user/delete?id= - *deletes user with given ID*
 
## Demo
1. User list:
![list_users][list_users]  
1. Add user:
![add_user][add_user]
1. Show user:
![show_user][show_user]
1. Edit user:
![edit_user][edit_user]
1. Delete user: 
![delete_user][delete_user]

[list_users]: images/userList.png "Users list"
[add_user]: images/addUser.png "Add user"
[show_user]: images/userDetails.png "Show user details"
[edit_user]: images/editUser.png "Edit user"
[delete_user]: images/deleteUser.png "Delete user"
