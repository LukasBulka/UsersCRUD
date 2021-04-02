<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header.jsp" %>
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Users CRUD</h1>
        <a href="<c:url value="/user/list"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i>User list</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">User details</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <tbody>
                  <tr>
                      <th>Id</th>
                      <td>${user.id}</td>
                  </tr>
                  <tr>
                      <th>User name</th>
                      <td>${user.username}</td>
                  </tr>
                  <tr>
                      <th>Email</th>
                      <td>${user.email}</td>
                  </tr>
                  </tbody>
                </table>

                <form method="post">
                    <button type="submit" class="btn btn-primary shadow-sm">Back to list</button>
                </form>
            </div>
        </div>
    </div>
</div>
<%@ include file="/footer.jsp" %>
