<html>
<head>
<title>Uploading images</title>
</head>
<body>
<form action="image.php" method="post" enctype="multipart/form-data">
Select Image:<input type="file" name="image">
<input type="submit" name="upload" value="Upload Now">
</form>
<?php

mysql_connect("localhost","root", "");
mysql_select_db("vote");
$sql2= mysql_query("select * from candidates");
while($row = mysql_fetch_array($sql2))
{
	$id = $row['name'];
	echo $id;
if(isset($_POST['upload'])){
$image_name = $_FILES['image']['name'];
$image_type = $_FILES['image']['type'];
$image_size = $_FILES['image']['size'];
$image_tmp_name= $_FILES['image']['tmp_name'];
if($image_name==''){
echo "<script>alert('Please Select an Image')</script>";
exit();
}
else
move_uploaded_file($image_tmp_name,"images/$image_name");
echo "Image Uploaded Successfully Here is the image". "<br>";
$var = "http://10.0.0.2/vote/images/$image_name";

echo $var;
echo "<img src='http://127.0.0.01/vote/images/$image_name'>";

 $query = "UPDATE candidates

            SET image = $var
        WHERE name = '$id'";
mysql_query($query);
}
}
?>
</body>
</html>