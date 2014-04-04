<?php

mysql_connect("localhost", "root","");
mysql_select_db("vote");

$var1 = $_POST['name'];
echo $var1;
echo "<br>";

$var2 =  $_POST['email'];
echo $var2;
echo "<br>";

$var3 =  $_POST['const'];
echo $var3;
echo "<br>";

$var4 =  0;
echo $var4;
echo "<br>";

$var5 =  $_POST['deviceid'];
echo $var5;
echo "<br>";

$var6 =  $_POST['age'];
echo $var6;
echo "<br>";

$var7 =  $_POST['sex'];
echo $var7;
echo "<br>";


$sql = mysql_query("INSERT INTO user values('$var1','$var2','$var3','$var4', '$var5', '$var6', '$var7')");

if($sql)
	echo " TRUE";

?>