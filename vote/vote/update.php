   <?php
   mysql_connect("localhost","root","");
mysql_select_db("vote");
    
  $var  = $_POST['name'];
  $star = $_POST['star'];

    $fet=mysql_query("select * from primeminister where name='$var'");
    while($row= mysql_fetch_array($fet))
{
        $rating = $row['rating'];
        $numb = $row['numb'];
}
$numb= $numb+1;
echo $numb;


$query2 = "UPDATE primeminister

            SET rating = $star
        WHERE name = '$var'";
mysql_query($query2);

$query = "UPDATE primeminister

            SET numb = $numb
        WHERE name = '$var'";
mysql_query($query);

    $json = array();
    $fet2=mysql_query("select * from primeminister where name='$var'");
    while($r=mysql_fetch_array($fet2)){
    $json[] = $r;
    }

    //Display the JSOn data
    echo $json_data=json_encode($json);

    ?>