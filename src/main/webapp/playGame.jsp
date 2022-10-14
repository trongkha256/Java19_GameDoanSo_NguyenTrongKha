<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<div class="container">
       <h1>Wellcome ${listPlayer.getName()} !</h1>
    <div class="row">
        <div class="col-6">
            <h2>Please enter your number: </h2>
            <form action="http://localhost:8085/game" method="get">
                <div class="mb-3">
                    <label class="form-label">Guess number </label>
                    <input type="text" class="form-control" name="number">
                </div>
                <input type="submit" value="submit" class="btn btn-primary" />
            </form>
        </div>
    </div>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Name</th>
            <th scope="col">Number of gusing</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var = "i" begin="0" end="${listProduct.size()-1}">
                <tr>
                    <td>${i}</td>
                    <td>${listPlayer[i].getName()}</td>
                    <td>${listPlayer[i].getSeq()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
