# UsersCRUD
IT school workshop project. A simple web application for user management.

## General purpose
This MVC based app allows you to create and manage users data involving Tomcat container for Java Servlets and JSPs covered with a nice and friendly SB Admin 2 template.
  
## Functionalities
Available endpoints:
* .../user/list - *list all created users*
1. Users list:
  ![list_users][list_users]
* .../user/add - *create new user*
1. Add user
  ![add_user][add_user]
* .../user/show?id= - *show details of user with given ID*
1. Show user details:
  ![show_user][show_user]
* .../user/edit?id= - *edit user with given ID*
1. Edit user
  ![edit_user][edit_user]
* .../user/delete?id= - *delete user with given ID*
1. Delete user
  ![delete_user][delete_user]
  
[list_users]: images/userList.png "Users list"
[add_user]: images/addUser.png "Add user"
[show_user]: images/userDetails.png "Show user details"
[edit_user]: images/editUser.png "Edit user"
[delete_user]: images/deleteUser.png "Delete user"

## Technologies used
* JDBC
* MySQL
* JBCrypt
* Http Servlets
* SB Admin2 theme
* JSP
* Expression Language
* JSTL
