# UsersCRUD
IT school workshop project. A simple web application for user management.

## General purpose
This MVC based app allows you to create and manage users data involving Tomcat container for Java Servlets and JSPs covered with a nice and friendly SB Admin 2 template.
  
## Functionalities
Available endpoints:
* .../user/list - *list all created users*
* .../user/add - *create new user*
* .../user/show?id= - *show details of user with given ID*
* .../user/edit?id= - *edit user with given ID*
* .../user/delete?id= - *delete user with given ID*

## Technologies used
* JDBC
* MySQL
* JBCrypt
* Http Servlets
* SB Admin2 theme
* JSP
* Expression Language
* JSTL

## How does it work?
1. Users list:
![list_users][list_users]
3. Add user
![add_user][add_user]
1. Show user details:
![show_user][show_user]
1. Edit user
![edit_user][edit_user]
1. Delete user
![delete_user][delete_user]

[list_users]: images/userList.png "Users list"
[add_user]: images/addUser.png "Add user"
[show_user]: images/userDetails.png "Show user details"
[edit_user]: images/editUser.png "Edit user"
[delete_user]: images/deleteUser.png "Delete user"
