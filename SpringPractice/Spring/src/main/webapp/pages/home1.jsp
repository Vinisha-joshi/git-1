<html>
<head></head>
<body>
  <form action="/addAlien"  modelAttribute="alien">
  <label>ID:</label>
      <input type="text" name="aid"></input><br>
    <label>Name:</label>
    <input type="text" name="aname"></input><br>
    <label>Language:</label>
    <input type="text" name="lang"></input><br>
    <input type="submit"></input>
  </form>
  <form action="getAlien">
      <label>ID:</label>
      <input type="text" name="aid"></input><br>
      <input type="submit"></input>
    </form>
</body>
</html>