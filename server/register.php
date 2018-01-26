<?php
require_once('db.php');
// register activity

$username = $_POST['username'];
$email = $_POST['email'];
$phoneNumber = $_POST['phoneNumber'];
$password = $_POST['password'];

$stmt = $db_conn->prepare("INSERT INTO users(username,email,phoneNumber,password) VALUES(:username,:email,:phoneNumber,:password)");
$stmt->execute(array(':username' => $username, ':email' => $email, ':phoneNumber' => $phoneNumber, ':password' => md5($password) ));