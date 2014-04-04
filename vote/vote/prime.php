   <?php
   mysql_connect("localhost","root","");
mysql_select_db("vote");
    //Table name
$var = $_GET['name'];
//$var = "Narendra Modi";
  
    $fet=mysql_query("select * from primeminister where name = '$var'");
    $json = array();
    while($r=mysql_fetch_array($fet)){
    $json[] = $r;
    }

    //Display the JSOn data
    echo $json_data=json_encode($json);

    ?>