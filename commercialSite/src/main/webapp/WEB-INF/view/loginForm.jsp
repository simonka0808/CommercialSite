<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:wrapper>
	<body>
		<div class="login">
			<div class="login__content">
				<div class="login__img">
					<img
						src="https://www.fashionrevolution.org/wp-content/themes/fashion-revolution/assets/img/logo.svg"
						alt="">
				</div>

				<div class="login__forms">
					<form method="post" class="login__registre" id="login-in">
						<h1 class="login__title">Sign In</h1>

						<div class="login__box">
							<i class='bx bx-user login__icon'></i> <input type="text"
								placeholder="Username" id="username" name="username" class="login__input">
						</div>

						<div class="login__box">
							<i class='bx bx-lock-alt login__icon'></i> <input type="password"
								placeholder="Password" id="password" name="password" class="login__input">
						</div>
						
						<a href="#" class="login__forgot">Forgot password?</a> 
						<button class="login__button" type="submit" value="submit">Sign In</button>
<!-- 						<a href="#"
							class="login__button">Sign In</a> -->

						<div>
							<span class="login__account">Don't have an Account ?</span> <span
								class="login__signin" id="sign-up">Sign Up</span>
						</div>
					</form>

					<form action="" class="login__create none" id="login-up">
						<h1 class="login__title">Create Account</h1>

						<div class="login__box">
							<i class='bx bx-user login__icon'></i> <input type="text"
								placeholder="Username" class="login__input">
						</div>

						<div class="login__box">
							<i class='bx bx-at login__icon'></i> <input type="text"
								placeholder="Email" class="login__input">
						</div>

						<div class="login__box">
							<i class='bx bx-lock-alt login__icon'></i> <input type="password"
								placeholder="Password" class="login__input">
						</div>

						<a href="#" class="login__button">Sign Up</a>

						<div>
							<span class="login__account">Already have an Account ?</span> <span
								class="login__signup" id="sign-in">Sign In</span>
						</div>

						<div class="login__social">
							<a href="#" class="login__social-icon"><i
								class='bx bxl-facebook'></i></a> <a href="#"
								class="login__social-icon"><i class='bx bxl-twitter'></i></a> <a
								href="#" class="login__social-icon"><i class='bx bxl-google'></i></a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
</t:wrapper>