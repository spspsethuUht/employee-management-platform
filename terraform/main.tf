resource "aws_instance" "employee_app" {
  ami           = "ami-04cc7e4039506421f"
  instance_type = "t3.micro"

  tags = {
    Name = "employee-management-server"
  }
}
