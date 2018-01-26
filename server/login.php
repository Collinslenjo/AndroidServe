<?php
session_start();
require_once('db.php');
// Login Activity

$email = $_POST['email'];
$password = $_POST['password'];