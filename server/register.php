<?php
// register activity


$stmt = $db_conn->prepare("INSERT INTO users(username,email,phoneNumber,password) VALUES(:username,:email,:phoneNumber,:password)");
$stmt->execute(array(':username' => $username, ':email' => $email, ':phoneNumber' => $phoneNumber, ':password' => md5($password) ));