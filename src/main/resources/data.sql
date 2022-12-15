INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (1, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', true, 'tinhba');
INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (2, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', false, 'datcong');
INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (3, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', false, 'tanngoc');
INSERT INTO users(
	id, cccd, birthday, email, image, name, password, phonenum, type, username)
	VALUES (4, '123456789', '2001-04-10 00:00:00', 'duongtinh@gmail.com', null, 'Dương Bá Tình', '123456', '1234567891', false, 'toannguyen');

--Room
INSERT INTO room(
	id, area, image, name, number_of_tenants, price, rent_from, sex, users_id)
	VALUES (1, 20, null, 'P001', 2, 1000000, '2022-10-10 10:22:00', 'Nam', 1);
INSERT INTO room(
	id, area, image, name, number_of_tenants, price, rent_from, sex, users_id)
	VALUES (2, 30, null, 'P002', 3, 1500000, '2022-10-10 10:21:00', 'Nữ', 1);
INSERT INTO room(
	id, area, image, name, number_of_tenants, price, rent_from, sex, users_id)
	VALUES (3, 20, null, 'P003', 2, 1000000, '2022-10-10 10:20:00', 'Nam/Nữ', 1);

--Service
INSERT INTO service(
	id, detail, name, price, room_id)
	VALUES (1, 'Chi phí cho bảo vệ hàng tháng để giữ xe và quản lí cổng ra vào', 'Bảo vệ', 15000, 1);

--Tenants
INSERT INTO tenants(
	id, time, room_id, users_id, tenant_id)
	VALUES (1, '2022-10-10 10:56:00', 1, 1, 2);
INSERT INTO tenants(
	id, time, room_id, users_id, tenant_id)
	VALUES (2, '2022-10-10 10:20:00', 1,1, 3);

--Tus
INSERT INTO tus(
	id, note, time, room_id)
	VALUES (1, 'Phòng trọ cho sinh viên, sạch sẽ, thoáng mát. Liên hệ chủ trọ: 0373773172 hoặc tới địa chỉ trên để xem phòng.', '2022-12-05 10:20:00', 2);

--Revenue
INSERT INTO revenue(
	id, code, groups, note, price, time, type, room_id, tenant_id, users_id)
	VALUES (1, '#121', 'Thu', 'Thanh toán tiền phòng', 1000000, '2022-10-18 16:50:00', 'Tiền phòng', 2, 3, 1);
INSERT INTO revenue(
	id, code, groups, note, price, time, type, room_id, tenant_id, users_id)
	VALUES (2, '#122', 'Thu', 'Thanh toán tiền phòng', 1000000, '2022-10-19 10:34:00', 'Tiền phòng', 1, 2, 1);
INSERT INTO revenue(
	id, code, groups, note, price, time, type, room_id, tenant_id, users_id)
	VALUES (3, '#123', 'Thu', 'Thanh toán tiền phòng', 1000000, '2022-11-20 15:26:00', 'Tiền phòng', 1, 2, 1);
INSERT INTO revenue(
	id, code, groups, note, price, time, type, room_id, tenant_id, users_id)
	VALUES (4, '#124', 'Thu', 'Thanh toán điện nước', 100000, '2022-11-20 15:30:00', 'Tiền điện nước', 1, 2, 1);

--Notification
INSERT INTO notification(
	id, content, time, type, tenant_id, users_id)
	VALUES (1, 'Hóa đơn tiền phòng P001 tháng 9 đã được thanh toán', '2022-10-19 10:35:00', 0, 2, 1);
INSERT INTO notification(
	id, content, time, type, tenant_id, users_id)
	VALUES (2, 'Hóa đơn tiền phòng tháng 10 P001 đã được thanh toán', '2022-11-20 15:27:00', 0, 2, 1);
INSERT INTO notification(
	id, content, time, type, tenant_id, users_id)
	VALUES (3, 'Điện nước tháng 10 P001 đã được thanh toán', '2022-11-20 15:31:00', 1, 2, 1);

--Info
INSERT INTO info(
	id, address, name, price, sum, vote, user_id)
	VALUES (1, '162 Lê Quý Đôn, Tân Lập, Đông Hòa, Dĩ An,Bình Dương', 'Nhà trọ cho SV', 1000000, 20, 3.5, 1);

--Incident
INSERT INTO incident(
	id, image, note, status, time, type, room_id)
	VALUES (1, null, 'Hỏng bóng đèn', 'Đã xử lý', '2022-10-10 10:54:00', 'Hỏng bóng đèn', 1);
INSERT INTO incident(
	id, image, note, status, time, type, room_id)
	VALUES (2, null, 'Hỏng vòi nước', 'Đang xử lý', '2022-11-10 10:34:00', 'Hỏng vòi nước', 1);
INSERT INTO incident(
	id, image, note, status, time, type, room_id)
	VALUES (3, null, 'Hỏng ổ cắm điện', 'Đang đợi xử lý', '2022-12-10 10:10:00', 'Hỏng ổ cắm điện', 1);

--Bill
INSERT INTO bill(
	id, code, end_time, note, price, start_time, status, type, room_id)
	VALUES (1, '#121', '2022-11-30 00:00:00', '?', 1000000, '2022-10-10 00:00:00', 'Đã thanh toán', 'Tiền phòng', 2);
INSERT INTO bill(
	id, code, end_time, note, price, start_time, status, type, room_id)
	VALUES (2, '#122', '2022-11-30 00:00:00', '?', 1000000, '2022-10-10 00:00:00', 'Đã thanh toán', 'Tiền phòng', 1);
INSERT INTO bill(
	id, code, end_time, note, price, start_time, status, type, room_id)
	VALUES (3, '#123', '2022-11-30 00:00:00', '?', 1000000, '2022-10-10 00:00:00', 'Đã thanh toán', 'Tiền phòng', 1);
INSERT INTO bill(
	id, code, end_time, note, price, start_time, status, type, room_id)
	VALUES (4, '#124', '2022-11-30 00:00:00', '?', 100000, '2022-10-10 00:00:00', 'Đã thanh toán', 'Tiền điện nước', 1);
INSERT INTO bill(
	id, code, end_time, note, price, start_time, status, type, room_id)
	VALUES (5, '#125', '2022-11-30 00:00:00', '?', 1000000, '2022-11-10 00:00:00', 'Trễ hạn', 'Tiền phòng', 2);
INSERT INTO bill(
	id, code, end_time, note, price, start_time, status, type, room_id)
	VALUES (6, '#126', '2022-12-30 00:00:00', '?', 100000, '2022-12-10 00:00:00', 'Chưa thanh toán', 'Tiền điện nước', 1);
INSERT INTO bill(
	id, code, end_time, note, price, start_time, status, type, room_id)
	VALUES (7, '#127', '2022-12-30 00:00:00', '?', 1000000, '2022-12-10 00:00:00', 'Chưa thanh toán', 'Tiền phòng', 1);


