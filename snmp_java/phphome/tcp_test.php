<?php

$i=0;
$ip= "127.0.0.1";
$tcp_con_state= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.1");
$conn_local_addrs= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.2");
$conn_local_port= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.3");
$conn_remote_addrs= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.4");
$conn_remote_port= snmp2_walk($ip,"public",".1.3.6.1.2.1.6.13.1.5");



foreach($tcp_con_state as $obj){

    echo $i.";";
    
    echo $obj.";";
    echo $conn_local_addrs[$i].";";
    echo $conn_local_port[$i].";";
    echo $conn_remote_addrs[$i].";";
echo $conn_remote_port[$i].";" ; 
$i++;
}

