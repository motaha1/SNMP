<?php
require('header.html');
$ip= "127.0.0.1";
$udp_table= snmp2_walk($ip,"public",".1.3.6.1.2.1.7.5.1.1");

$udp_table2= snmp2_walk($ip,"public",".1.3.6.1.2.1.7.5.1.2");

$i=0;

echo "<div class='container'> <table class='table table-hover'>";
echo "<thead class='thead-dark'> <tr> <th>Index</th> <th>UDP local Address</th><th>UDP Local port</th></tr></thead>";

foreach($udp_table as $obj){

    echo "<tr><td>".$i."</td><td>".$obj."</td><td>".$udp_table2[$i]."</td></tr>";
    
    $i++;
}

 ////// mohammad taha
  ////// mohammad taha
   ////// mohammad taha
    ////// mohammad taha
     ////// mohammad taha
