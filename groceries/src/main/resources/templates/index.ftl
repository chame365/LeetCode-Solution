<#import "spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>My Login Page &mdash; Bootstrap 4 Login Page Snippet</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<@spring.url'/css/crypto.css'/>">
  </head>
  <body class="my-login-page">
    <section class="h-100">
      <div class="container h-100">
        <div class="row justify-content-md-center h-100">
          <div class="card-wrapper">
            <div class="brand">
              <img src="<@spring.url'/img/logo.jpg'/>" alt="bootstrap 4 login page">
            </div>
            <div class="card fat">
              <div class="card-body">
                <h4 class="card-title text-center">Crypto Tools</h4>
                <form class="my-login-validation" novalidate="">
                  <div class="form-group">
                    <label for="password">Password</label>
                    <label>
                      <input type="radio" name="method" value="encode" checked>加密
                      <input type="radio" name="method" value="decode">解密
                    </label>
                  </div>
                  <div class="form-group">
                    <label for="password">Password</label>
                    <label>
                      <select class="form-control" name="type">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                      </select>
                    </label>
                  </div>

                  <div class="form-group">
                    <label for="password">Password</label>
                    <label>
                      <textarea class="form-control" name="message" rows="3" style="resize: none;"></textarea>
                    </label>
                  </div>

                  <div class="form-group m-0">
                    <button id="btnSubmit" type="button" class="btn btn-primary btn-block">
                      Register
                    </button>
                  </div>
                  <div class="mt-4 text-center" id="mew">
                    Already have an account? <a href="index.ftl">Login</a>
                  </div>
                </form>
              </div>
            </div>
            <div class="footer">
              Copyright &copy; 2017 &mdash; Your Company
            </div>
          </div>
        </div>
      </div>
    </section>

    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <script src="<@spring.url'/js/crypto.js'/>"></script>
  </body>
</html>
