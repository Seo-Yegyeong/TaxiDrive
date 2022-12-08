<%--
  Created by IntelliJ IDEA.
  User: Lab
  Date: 2022-12-04
  Time: 오전 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, height=device-height initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="YegyeongSeo, JeonghyunAn">
    <title>TaxiCall for disabilities</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="css/basic.css" rel="stylesheet">
</head>
<body>
<header>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <img src="img/taxi.png" alt="logo" width="20" height="20">
                TogetherTaxi
            </a>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav me-auto mb-2 mb-md-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled">Disabled</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<main class="container-fluid ">
    <img src="img/test.png" height="400" width="400">
</main>
<footer class="navbar navbar-expand-md navbar-dark fixed-bottom bg-dark">
<%--    https://parkwonhui.github.io/front/2019/04/24/front-bootstrap-footer.html--%>
    <p class="bottom">Developers <a href="https://github.com/Seo-Yegyeong">YegyeongSeo</a> &middot; <a href="https://github.com/AJeonghyun">JeonghyunAn</a></p>
</footer>
</body>
</html>
