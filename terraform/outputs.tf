/*
output "public_ip" {
  value = aws_instance.employee_app.public_ip
}*/
output "security_group_id" {
  value = aws_security_group.employee_sg.id
}


