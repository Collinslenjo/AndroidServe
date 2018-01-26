<?php
session_start();
require_once('db.php');
// Login Activity

$email = $_POST['email'];
$password = $_POST['password'];

$stmt = $db_conn->prepare("SELECT * FROM users WHERE email='$email' AND password='$password'");

if(!$row = $stmt->fetch_assoc())
{
	echo "Your email or password is incorrect!";
} else {
	$_SESSION['id'] = $row['id'];
}