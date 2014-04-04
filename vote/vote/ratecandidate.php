   <?php
   mysql_connect("localhost","root","");
mysql_select_db("vote");
 $name = "CHANDER KUMAR";   
//    $name = $_POST['name'];
/*
$star1 = $_POST['star1'];
$star2 = $_POST['star2'];
$star3 = $_POST['star3'];
$star4 = $_POST['star4'];
$star5 = $_POST['star5'];
*/
$star1 = 4.5;
$star2 = 3;
$star3 = 5;
$star4 = 4;
$star5 = 2;

    $fet=mysql_query("select * from candidates where name='$name'");
    while($row= mysql_fetch_array($fet))
{
$s1 = $row['women'];
$s2 = $row['education'];
$s3 = $row['health'];
$s4 = $row['corruption'];
$s5 = $row['technology'];
$num = $row['num'];
}
$num= $num+1;
echo $num;


$query2 = "UPDATE candidates

            SET women = $star1 , education = $star2 , health = $star3, corruption = $star4, technology=$star5 ,num = $num
        WHERE name = '$name'";
mysql_query($query2);


    $json = array();
    $fet2=mysql_query("select * from candidates where name='$name'");
    while($r=mysql_fetch_array($fet2)){
    $json[] = $r;
    }

    //Display the JSOn data
    echo $json_data=json_encode($json);

    ?>