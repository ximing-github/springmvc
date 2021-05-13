mvc小项目 实现学生的查询和添加功能
    1.数据库表的准备
    2.创建实体类
    3.加入依赖
    4.创建servic和dao
        dao层中的namespace 路径要写到具体的接口（不是包名）
    5.创建controller控制器类
    6.创建配置文件
        mybatis
            关联dao包，实体类重命名（简写）
        properties
            设置jdbc连接数据库需要的url 用户名 密码
        spring
            目的是管理service和dao对象

        springmvc
            声明控制器controller实体类所在的包
            声明视图解析器
        web.xml
            配置中央调度器（servlet）

    7.编写前端页面jsp




