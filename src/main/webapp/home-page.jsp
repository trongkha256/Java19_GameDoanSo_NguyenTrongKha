<html>
<head>
<style>
.imageBG {
  background-image: url('https://i.ytimg.com/vi/JhkxeWVlv1g/maxresdefault.jpg');
  width:100%;
  height: 100%;
}
.wellcome{
    padding-top: 2%;
    margin-left: 20px;
    color: white;
}
</style>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

<head>
<body>
<div class="imageBG">
    <div class="wellcome">
        <h1>Wellcome!</h1>
        <h2 lass="mb-3">Please enter your name to continue.</h2>
        <form action="http://localhost:8085/doanSo/home-page" method="get">
          <div class="mb-3">
            <input type="text" class="form-control w-25" id="exampleInputEmail1" name="username">
          </div>

          <button type="submit" class="btn btn-primary">Continue</button>
        </form>
    </div>
</div>
<!-- JavaScript Bundle with Popper -->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
