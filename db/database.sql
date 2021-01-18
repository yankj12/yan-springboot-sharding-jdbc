create table goods_1(
  gid BIGINT(20) PRIMARY KEY COMMENT "商品id，主键",
  gname VARCHAR(50) NOT NULL COMMENT "商品名称",
  user_id BIGINT(20) NOT NULL COMMENT "用户ID",
  gstatus VARCHAR(10) NOT NULL COMMENT "商品状态，已发布OR未发布"
);

create table goods_2(
  gid BIGINT(20) PRIMARY KEY COMMENT "商品id，主键",
  gname VARCHAR(50) NOT NULL COMMENT "商品名称",
  user_id BIGINT(20) NOT NULL COMMENT "用户ID",
  gstatus VARCHAR(10) NOT NULL COMMENT "商品状态，已发布OR未发布"
);
