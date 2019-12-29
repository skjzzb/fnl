<%@ Page Title="" Language="C#" MasterPageFile="~/InfowayEM.Master" AutoEventWireup="true" CodeBehind="RegistrationEmp.aspx.cs" Inherits="InfowayEventManagement.Employee.RegistrationEmp" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">


    <hr>
<style>
@import url(https://fonts.googleapis.com/css?family=Raleway:300,400,600);


body{
    margin: 0;
    font-size: .9rem;
    font-weight: 400;
    line-height: 1.6;
    color: #212529;
    text-align: left;
    background-color: #f5f8fa;
}

.navbar-laravel
{
    box-shadow: 0 2px 4px rgba(0,0,0,.04);
}

.navbar-brand , .nav-link, .my-form, .login-form
{
    font-family: Raleway, sans-serif;
}

.my-form
{
    padding-top: 1.5rem;
    padding-bottom: 1.5rem;
}

.my-form .row
{
    margin-left: 0;
    margin-right: 0;
}

.login-form
{
    padding-top: 1.5rem;
    padding-bottom: 1.5rem;
}

.login-form .row
{
    margin-left: 0;
    margin-right: 0;
}
</style>
<script>
    function validform() {

        var a = document.forms["my-form"]["full-name"].value;
        var b = document.forms["my-form"]["email-address"].value;
        var c = document.forms["my-form"]["username"].value;
        var d = document.forms["my-form"]["permanent-address"].value;
        var e = document.forms["my-form"]["nid-number"].value;

        if (a == null || a == "") {
            alert("Please Enter Your Full Name");
            return false;
        } else if (b == null || b == "") {
            alert("Please Enter Your Email Address");
            return false;
        } else if (c == null || c == "") {
            alert("Please Enter Your Username");
            return false;
        } else if (d == null || d == "") {
            alert("Please Enter Your Permanent Address");
            return false;
        } else if (e == null || e == "") {
            alert("Please Enter Your NID Number");
            return false;
        }

    }
    </script>
<main class="my-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
                    <div class="card">
                        <div class="card-header " style="text-align:center; font-size:large">Register</div>
                        <div class="card-body">
                            
                              <form id="form2" runat="server">
                                <div class="form-group row">
                                    <label for="user_name" class="col-md-4 col-form-label text-md-right">User Name</label>
                                    <div class="col-md-6">
                                        <asp:TextBox ID="user_name" CssClass="form-control" runat="server"></asp:TextBox>
                                       <!-- --> <input type="text" id="user_name" class="form-control" name="username">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="password" class="col-md-4 col-form-label text-md-right">Password</label>
                                    <div class="col-md-6">
                                        <input type="password" id="password" class="form-control" name="password">
                                    </div>
                                </div>


                                 <div class="form-group row">
                                    <label for="emp_id" class="col-md-4 col-form-label text-md-right">Employee ID</label>
                                    <div class="col-md-6">
                                        <input type="number" id="EmployeeId" class="form-control" name="EmployeeId">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="EmployeeName" class="col-md-4 col-form-label text-md-right">Employee Name</label>
                                    <div class="col-md-6">
                                        <input type="text" id="EmployeeName" class="form-control" name="EmployeeName">
                                    </div>
                                </div>
                                
                                <div class="form-group row">
                                    <label for="email_address" class="col-md-4 col-form-label text-md-right">E-Mail Address</label>
                                    <div class="col-md-6">
                                        <input type="email" id="EmployeeEmail" class="form-control" name="EmployeeEmail">
                                    </div>
                                </div>

                                

                                <div class="form-group row">
                                    <label for="EmployeeContact" class="col-md-4 col-form-label text-md-right">Phone Number</label>
                                    <div class="col-md-6">
                                        <input type="number" id="EmployeeContact" name="EmployeeContact" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="EmployeeAddress" class="col-md-4 col-form-label text-md-right">Employee Address</label>
                                    <div class="col-md-6">
                                        <input type="text" id="EmployeeAddress" name="EmployeeAddress" class="form-control">
                                    </div>
                                </div>
                                
                            <div class="form-group row">
                                    <label for="EmployeeCity" class="col-md-4 col-form-label text-md-right">EmployeeCity</label>
                                    <div class="col-md-6">
                                        <input type="text" id="EmployeeCity" name="EmployeeCity" class="form-control">
                                    </div>
                                </div>

                             <div class="form-group row">
                                    <label for="EmployeeAvatar" class="col-md-4 col-form-label text-md-right">Avatar</label>
                                    <div class="col-md-6">
                                        <input type="text" id="EmployeeAvatar" name="EmployeeAvatar" class="form-control">
                                    </div>
                                </div>
                            <div class="form-group row">
                                    <label for="EmployeeJoiningDate" class="col-md-4 col-form-label text-md-right">Employee Joining Date</label>
                                    <div class="col-md-6">
                                        <input type="date" id="EmployeeJoiningDate" name="EmployeeJoiningDate" class="form-control">
                                    </div>
                                </div>
                             <div class="form-group row">
                                    <label for="EmployeeSkillSet" class="col-md-4 col-form-label text-md-right">Employee SkillSet</label>
                                    <div class="col-md-6">
                                        <input type="text" id="EmployeeSkillSet" name="EmployeeSkillSet" class="form-control">
                                    </div>
                                </div>




                                

                                

                                    <div class="col-md-4 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                        Register
                                        </button>
                                    </div>
                                </div>
                            </>
                        </div>
                    </div>
            </div>
        </div>
    

</main>  

</asp:Content>
