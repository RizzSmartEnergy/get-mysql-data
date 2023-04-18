<?php

// server
$servername = "localhost";
// db name
$dbname = "db_name";
// username
$username = "username";
// pssword
$password = "password";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

//limit this with 1 to get the latest value 
$sql = "SELECT * FROM TableName ORDER BY id DESC LIMIT 1"; 

$result = mysqli_query($conn, $sql);

$hasil_json = array();

    while ($row = mysqli_fetch_assoc($result)){
        $hasil_json[] = $row;
    echo json_encode($hasil_json)."\n";
    }
?>