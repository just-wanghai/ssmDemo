var userCode = null;
var userName = null;
var userPassword = null;
var phone = null;
var birthday = null;
var userRole = null;
var addBtn = null;
var backBtn = null;

$(function() {
	userCode = $("#userCode");
	userName = $("#userName");
	userPassword = $("#userPassword");
	phone = $("#phone");
	birthday = $("#birthday");
	userRole = $("#userRole");
	addBtn = $("#add");
	backBtn = $("#back");
	// 初始化的时候，要把所有的提示信息变为：* 以提示必填项，更灵活，不要写在页面上
	userCode.next().html("*");
	userName.next().html("*");
	userPassword.next().html("*");
	phone.next().html("*");
	birthday.next().html("*");
	userRole.next().html("*");

	addBtn.bind("click", function() {
		if (confirm("是否确认提交数据")) {
			$("#userForm").submit();
		}
	});

	backBtn.on("click", function() {
		if (referer != undefined && null != referer && "" != referer
				&& "null" != referer && referer.length > 4) {
			window.location.href = referer;
		} else {
			history.back(-1);
		}
	});
});