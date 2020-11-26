CREATE TABLE `t_order` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `merchant_id` varchar(255) DEFAULT NULL COMMENT '店铺id',
  `order_no` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `order_weight` double DEFAULT NULL COMMENT '订单重量',
  `order_type` int DEFAULT NULL COMMENT '订单类型',
  `order_status` int DEFAULT NULL COMMENT '订单状态，0=待付款，1=待审核，2=支付未完成,3=待发货，4=已发货，5=已签收，6=已取消，7=已关闭，20=部分发货',
  `order_create_time` datetime DEFAULT NULL,
  `order_update_time` datetime DEFAULT NULL,
  `order_create_person` varchar(255) DEFAULT NULL,
  `order_update_person` varbinary(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `orderno` (`order_no`) USING BTREE,
  KEY `merchantid` (`merchant_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




CREATE TABLE `t_product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `type` int DEFAULT NULL COMMENT '商品类型',
  `code` varchar(255) DEFAULT NULL COMMENT '商品编码',
  `details` varchar(255) DEFAULT NULL COMMENT '商品描述',
  `category` int DEFAULT NULL COMMENT '分类',
  `brand_id` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name` (`name`) USING BTREE,
  KEY `code` (`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `t_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

