<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="AuthMations-router">   
<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <router-link to="/AuthMations/UserPer" class="nav-link"> 用户权限管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/AuthMations/PositionPer" class="nav-link"> 职位权限管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/AuthMations/FunctionPer" class="nav-link"> 功能权限管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/AuthMations/PerConfig" class="nav-link"> 权限配置管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/AuthMations/PerControl" class="nav-link"> 权限控制管理
	  </router-link>
    </li>
  
    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Dropdown link
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
  </ul>
</nav>
	<!-- router-view是组件显示的地方 -->
	<router-view></router-view>
</div>