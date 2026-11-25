resource "aws_eip" "employee_eip" {
  domain = "vpc"

  tags = {
    Name = "employee-management-eip"
  }
}