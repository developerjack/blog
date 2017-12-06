CREATE TABLE IF NOT EXISTS t_user
(
  id             INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  username       VARCHAR(20) NOT NULL COMMENT '账号',
  password       VARCHAR(32) NOT NULL COMMENT '密码',
  create_user_id INT(11) DEFAULT '0' COMMENT '创建人id',
  create_time    DATETIME NOT NULL COMMENT '创建时间',
  update_user_id INT(11) DEFAULT '0' COMMENT '更新人id',
  update_time    TIMESTAMP NOT NULL COMMENT '更新时间',
  valid          INT(1) DEFAULT '1' COMMENT '是否有效（1：有效；0：无效）',
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '会员';

INSERT INTO t_user (id, username, password, create_user_id, create_time, update_user_id, update_time, valid)
VALUES (1, 'admin', '0C909A141F1F2C0A1CB602B0B2D7D050', null, now(), null, now(), 1);-- 默认密码admin123