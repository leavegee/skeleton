﻿vip-admin Html v1.0.0.zip                       更新时间:2017-01-06
更新日志：
1.该模板最大化保留了原生layui的基础样式，整合行成的一套后台模板。
2.该模板集合了layui插件、datatables插件。
3.该模板使用layui基础样式中的按钮、表单、表格、和选项卡
4.datatables表格和layui表格深度整合，使用更加方便、美观、人性化。
5.扩展了欢迎页面、登录页面。

vip-admin Html v1.0.1.zip                       更新时间:2017-02-16
更新日志：
1.优化datatables表格，添加排序图标，点击升序降序更加美观；表格全选优化，全选后所有选中项添加背景颜色，使之选中更加明显。
2.添加echearts图表插件，展示了基本的柱状图和饼图示例。

vip-admin Html v1.1.0.zip                       更新时间:2017-02-27
更新日志:
1.登录页面添加头部标题
2.新增tree table 页面
3.新增404页面
4.新增tips提示页面
5.js功能: 具体操作请查看 js/table-tool.js
            getIds(table对象,获取input为id的属性);
            deleteAll(ids,请求url,操作成功跳转url,操作失败跳转url);
            UnixToDate(时间戳,显示年月日时分,加8小时显示正常时间区);
6.该版本已兼容手机浏览

vip-admin Html v1.5.0.zip                       更新时间:2017-03-20
1.更新layui框架为最新版1.0.9_rts版本。
2.优化css,样式更加接近vip-admin管理系统v1.0.5。
3.新增效果：导航栏点击栏目右侧添加相应tab选项卡,点击已经生成过的选项卡直接跳转到该选选项卡
4.新增导航栏收缩按钮
5.修改已知BUG

vip-admin Html v1.5.1.zip                       更新时间:2017-03-21
1.修改浏览器窗口resize时不断闪烁BUG。  感谢：Clannad-

vip-admin Html v1.6.0.zip                       更新时间:2017-04-25
1.优化CSS、JS
2.新增新的登录、注册页面。
3.新增主题功能，提供默认、纯白、蓝白三种主题配置。
4.导航栏添加图标。
5.修改已知BUG。

vip-admin Html v1.7.0.zip                       更新时间:2017-05-21
1.优化主题样式细节。
2.标签新增双击关闭当前标签功能。
3.标签新增右键功能。
4.新增js功能。   详细可查看【frame/static/js】文件夹内的js
    vip_nav.js 【主页菜单js】
        具体功能：
        1) main方法       main(请求地址,过滤ID,是否展开,携带参数);
        2) top_left方法   top_left(请求地址,过滤ID,是否展开,携带参数);
    vip_tab.js 【子页面操作父页面选项卡js】
        具体功能：
        1) add方法            add(操作对象，标签标题，url地址);
        2) getThisTabId方法   getThisTabId();     // 返回当前展示页面父级窗口标签的lay-id
        3) del方法            del(标签lay-id);
    vip_table.js 【表格js,该js属于整合】
        具体功能：
        1) deleteAll方法      deleteAll(ids,请求的url,操作成功跳转url,操作失败跳转url)
        2) unixToDate方法     unixToDate(时间戳,是否只显示年月日时分,8)        // 返回正常时间
        3) getIds方法         getIds(表格对象,每条数据的属性id)      // 返回需要的 ids
5.修改已知BUG。



