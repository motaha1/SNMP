<?php
require('header.html');
$i=0;
$ip= "127.0.0.1";

/*
echo "index"."\t";
    
echo "Connection state"."\t";
echo "Connection local address"."\t";
echo "Connection local port"."\t";
echo "Connection remote address"."\t";
echo "Connection remote port"."\t"."\n";

foreach($tcp_con_state as $obj){

echo $i."\t";

echo $obj."\t";
echo $conn_local_addrs[$i]."\t";
echo $conn_local_port[$i]."\t";
echo $conn_remote_addrs[$i]."\t";
echo $conn_remote_port[$i]."\t"."\n";




$i++;
}
*/




$tcp_con_state= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.1");
$conn_local_addrs= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.2");
$conn_local_port= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.3");



$conn_remote_addrs= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.4");




$conn_remote_port= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.5");
echo "<div class='container'><table class='table table-hover' style='width: 100%'>";
echo" <thead class='thead-dark'><tr><th>Index</th><th>Connection state</th><th>source address</th><th>source port</th><th>dest. address</th><th>dest. port</th></tr></thead><tbody>";
foreach($tcp_con_state as $obj){
    echo "<tr><td>".$i."</td><td>".$obj."</td><td>".$conn_local_addrs[$i]."</td><td>".$conn_local_port[$i]."</td><td>".$conn_remote_addrs[$i]."</td><td>".$conn_remote_port[$i].
        "</td></tr>";
$i++;
}
echo"</tbody>";
?>