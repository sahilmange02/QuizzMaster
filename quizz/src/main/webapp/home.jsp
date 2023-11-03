<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>QuizzMaster</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <link rel="stylesheet" href="css/home.css">
</head>

<body>
  <nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark border-bottom border-body" data-bs-theme="dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="#"><img class="nav-image" src="quizzlogo1.png" alt=""></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
          </li>
          <!-- <li class="nav-item">
                <a class="nav-link" href="#">About Us</a>
              </li> -->
          <li class="nav-item">
            <a class="nav-link" href="contact.html">Contact</a>
          </li>
          <!-- <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Contact
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Write to us</a></li>
                  <li><a class="dropdown-item" href="#">Call us</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li> -->
        </ul>
        <button class="quizztime-button btn btn-outline-success mx-3" onclick="history.back()">Go Back</button>
        <form class="d-flex" role="search">
          <a class="quizztime-button btn btn-outline-success" href="first.html">QuizzTime</a>
        </form>
      </div>
    </div>
  </nav>
  <div class="home">
    <div class="home-title">
      Welcome to QuizzMaster!!!
    </div>
    <div class="home-content">
      <p class="text">Are you ready to challenge your knowledge, test your wits, and have loads of fun along the way?
        Look no further, because you've just stumbled upon the best quiz app out there. Whether you're a trivia
        enthusiast, a pop culture connoisseur, or just someone looking for a little mental exercise, we've got you
        covered!
        <br>
        <br>
        Our app is designed with simplicity and ease of use in mind. It's perfect for testing your skill levels.<br><br>


      </p>
      <img class="home-image" src="quizzlogo.png" alt="">
    </div>
    <div class="contlist">
      <b>For Faculty:</b><br>

      Are you an educator looking to create engaging quizzes and exams for your students? QuizMaster has got you
      covered. With our easy-to-use interface, you can:

      <ul>
        <li> custom quizzes with a specific number of questions.</li>
        <li>Select the subject matter and topics to be covered.</li>
        <li>Set your own parameters for the quiz, like number of questions.</li>
        <li>Monitor your students' performance and view their scores.</li>
      </ul>
    
    <b>For Students:</b><br>

    Ready to put your knowledge to the test? Join our community of eager learners and:
    <ul>

      <li>Log in and access a wide range of quizzes in multiple-choice format.</li>
      <li>Challenge yourself on various subjects and topics.</li>
      <li>Answer questions and submit your quizzes.</li>
      <li>Instantly see your scores and review your performance.</li>
    </ul>
  </div>
    <a class="quizz-button" href="first.html">QuizzTime</a>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
    integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
    integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
    crossorigin="anonymous"></script>
</body>
<footer class="footer">
  &copy; 2023 QuizzMaster
</footer>

</html>