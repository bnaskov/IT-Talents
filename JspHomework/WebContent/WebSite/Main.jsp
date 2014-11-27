<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pretty Website</title>
<link rel="stylesheet" type="text/css" href="styles/Pretty-Website.css">
</head>
<body>
	<div id="container">
		<div>
			<%
				String header = "/WebSite/Header.jsp";
			%>
			<jsp:include page="<%=header%>" />
			<%
				String menu = "/WebSite/Menu.jsp";
			%>
			<jsp:include page="<%=menu%>" />
			<main>
			<div class="articles">
				<section>
				<h2>Welcome to home page</h2>
				<p>
					<span>Lorem ipsum dolor sit amet, consectetur adipisicing
						elit. Aliquid, aperiam atque consequuntur, dolore enim inventore.</span>
					Ducimus labore laborum maiores mollitia nam obcaecati omnis
					perferendis praesentium, quae quis sint tenetur voluptas?Lorem
					ipsum dolor sit amet, consectetur adipisicing elit. Aperiam dolor
					dolore, enim incidunt maxime modi natus nesciunt odit officiis
					placeat qui quia quisquam sed suscipit tenetur ut velit voluptate
					voluptatum!Lorem ipsum dolor sit amet, consectetur adipisicing
					elit. Blanditiis commodi facilis labore molestias odio. Ad aliquid
					aperiam culpa delectus, impedit ipsum.
				</p>
				</section>
				<section>
				<h3>Our Free Products</h3>
				<article> <img src="images/0005.jpg" alt="pic" />
				<h5>Just try to find me</h5>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Consectetur, culpa deserunt dolor doloribus impedit labore
					laudantium minima obcaecati vero voluptatum. Consectetur, culpa
					deserunt dolor doloribus impedit labore laudantium minima obcaecati
					vero voluptatum?</p>
				</article> <article> <img src="images/0004.jpg" alt="pic" />
				<h5>Meeting Place</h5>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Commodi consectetur cum dolore dolores eaque eligendi error
					explicabo iure laborum molestias mollitia, natus nesciunt non nulla
					pariatur saepe soluta veritatis vitae. Lorem ipsum dolor sit amet,
					consectetur adipisicing elit.</p>
				</article> <article> <img src="images/0003.jpg" alt="pic" />
				<h5>Just try to find me</h5>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad
					adipisci at beatae commodi corporis, dicta fuga itaque laboriosam
					libero magnam nobis nulla odio optio, praesentium quod similique
					ullam veritatis vero! Lorem ipsum dolor sit amet, consectetur
					adipisicing elit.</p>
				</article> </section>
			</div>
			<aside>
			<div>
				<h2>News</h2>
				<div>
					<p class="date">August 2, 2009</p>
					<p>Aliquam eget varius aecu.</p>
					<a href="#"> see more...</a>
				</div>
				<div>
					<p class="date">August 1, 2009</p>
					<p>Aliquam eget varius aecu.</p>
					<a href="#"> see more...</a>
				</div>
				<div>
					<p class="date">July 28, 2009</p>
					<p>Aliquam eget varius aecu.</p>
					<a href="#"> see more...</a>
				</div>
			</div>
			<div>
				<h2>Messages</h2>
				<p class="date">August 2, 2009</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Alias amet asperiores esse ex expedita facere, harum illum impedit
					maiores nesciunt numquam perferendis quibusdam reprehenderit sit
					soluta voluptas, voluptatem.Consequatur doloremque est molestias!
					Alias assumenda eos fuga nam quae unde vel.</p>
				<p>
					Author: <span>SoftUni</span>
				</p>
				<a href="#"> see all testimonials...</a>
			</div>
			</aside> </main>
			
			<%
				String footer = "/WebSite/Footer.jsp";
			%>
			<jsp:include page="<%=footer%>" />
		</div>
	</div>
</body>
</html>