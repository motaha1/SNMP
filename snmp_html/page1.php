<?php
require('header.html');

if(isset($_POST['con'])){
    snmp2_set("127.0.0.1","public",".1.3.6.1.2.1.1.4.0","s",$_POST['con']);
}
$ip= "127.0.0.1";
$sys_group= snmp2_walk($ip,"public",".1.3.6.1.2.1.1");
echo "<div class='container'> <table class='table table-hover'>
<thead class='thead-dark'><tr><th>System description</th><th>Object ID</th><th>Up time</th><th>Contact</th><th>Name</th><th>Location</th>
<th>Services</th> </tr></thead>
<tr>
";
//print_r ($sys_group); die ; 
//echo ($sys_group[0]); die ; 

/*echo "System description -------> ";    
  echo snmp2_get("127.0.0.1", "public", "1.3.6.1.2.1.1.1.0")."\n";
  //echo snmp2_walk($ip,"public",".1.3.6.1.2.1.1.1.0");
  
  echo "Object ID -------> "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.2.0")."\n";
  echo "Up time	------->"; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.3.0")."\n";
  echo "Contact	-------> "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.4.0")."\n";
  echo "Name ------->  "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.5.0")."\n";
  echo "Location------->  "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.6.0")."\n";*/

foreach($sys_group as $val)
    echo "<td>".$val."</td>";
echo "</tr>";

echo' <div>

<h2>Change Contact</h2>
<form action="page1.php" method="post">
<label for="con">New Contact</label>
    <input id="con" name="con" type="text" placeholder="Enter a new Contact">
    <input type="submit" ></form></div>' ;

    //////// moahammad taha 11821122
    ?>
