<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
    <br><br>
    <form class="form-inline">
        <div class="form-group">
            <label for="exampleInputFile">专业：</label>
            <select class="form-control">
                <option value="计算机与科学技术系">计算机与科学技术系</option>
                <option value="信息与软件工程系">信息与软件工程系</option>
                <option value="应用外语系">应用外语系</option>
                <option value="数字艺术系">数字艺术系</option>
                <option value="信息管理系">信息管理系</option>
            </select>
        </div>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <div class="form-group">
            <label for="exampleInputFile">班级：</label>
            <select class="form-control">
                <option value="信息工程17201">信息工程17201</option>
                <option value="信息工程17202">信息工程17202</option>
            </select>
        </div>
        &nbsp&nbsp
        <button type="submit" class="btn btn-default">查询</button>
    </form>
    <br>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">姓名</th>
            <th scope="col">学号</th>
            <th scope="col">First</th>
            <th scope="col">Second</th>
            <th scope="col">Third</th>
            <th scope="col">Fourth</th>
            <th scope="col">Fifth</th>
            <th scope="col">Sixth</th>
            <th scope="col">Seventh</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">成斌</th>
            <td>17310920201</td>
            <td>80</td>
            <td>80</td>
            <td>80</td>
            <td>80</td>
            <td>80</td>
            <td>80</td>
            <td>80</td>
        </tr>
        <tr>
            <th scope="row">吴恙</th>
            <td>17310920202</td>
            <td>25</td>
            <td>36</td>
            <td>28</td>
            <td>28</td>
            <td>28</td>
            <td>28</td>
            <td>28</td>
        </tr>
        <tr>
            <th scope="row">隔壁老王</th>
            <td>17310920203</td>
            <td>25</td>
            <td>36</td>
            <td>28</td>
            <td>28</td>
            <td>28</td>
            <td>28</td>
            <td>28</td>
        </tr>
        </tbody>
    </table>
</div>