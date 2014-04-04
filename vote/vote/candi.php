   <?php
   mysql_connect("localhost","root","");
mysql_select_db("vote");
    //Table name
$var = $_POST['const']
  
    $fet=mysql_query("select * from candidates where const = '$var'");
    $json = array();
    while($r=mysql_fetch_array($fet)){
    $json[] = $r;
    }

    //Display the JSOn data
    echo $json_data=json_encode($json);

    ?>