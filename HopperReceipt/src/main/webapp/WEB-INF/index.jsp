<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Receipt</title>
</head>
<body>
    <h1>Hopper's Receipt</h1>
    <p>Name: <c:out value="${name}" /></p>
    <p>Item: <c:out value="${itemName}" /></p>
    <p>Price: $<c:out value="${price}" /></p>
    <p>Description: <c:out value="${description}" /></p>
    <p>Vendor: <c:out value="${vendor}" /></p>
</body>
</html>
