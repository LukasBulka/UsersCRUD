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
Model and data access layers based on [UserDao](https://github.com/LukasBulka/UserDao project.
  
## Functionalities
Available endpoints:
* .../user/list - *list all created users*
  ![list_users][list_users]
* .../user/add - *create new user*
  ![add_user][add_user]
* .../user/show?id= - *show details of user with given ID*
  ![show_user][show_user]
* .../user/edit?id= - *edit user with given ID*
  ![edit_user][edit_user]
* .../user/delete?id= - *delete user with given ID*
  ![delete_user][delete_user]
  
[list_users]: images/userList.png "Users list"
[add_user]: images/addUser.png "Add user"
[show_user]: images/userDetails.png "Show user details"
[edit_user]: images/editUser.png "Edit user"
[delete_user]: images/deleteUser.png "Delete user"
