   <?php
   mysql_connect("localhost","root","");
mysql_select_db("vote");
    //Table name

    //
    $fet=mysql_query("select * from primeminister");
    $json = array();
    while($r=mysql_fetch_array($fet)){
    $json[] = $r;
    }

    //Display the JSOn data
    echo $json_data=json_encode($json);

    ?>