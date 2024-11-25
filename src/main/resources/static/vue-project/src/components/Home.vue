<template>
    <el-container>
        <!-- 头部区域 -->
        <el-header>
            <div class="titleBar">
                <img src="../assets/电影.svg" alt="">
                <div class="titleText">蓝桥购票</div>
                <div class="top_right">
                    <router-link to="/Login"><button>登录</button></router-link>
                    <router-link to="/Enroll"><button>注册</button></router-link>
                    <router-link to=""><button>我的订单</button></router-link>
                </div>
            </div>

            <div class="carousel">
                <el-carousel height="220px" motion-blur>
                    <el-carousel-item v-for="item in 4" :key="item">
                        <h3 class="small justify-center" text="2xl">{{ item }}</h3>
                    </el-carousel-item>
                </el-carousel>
            </div>

        </el-header>
        <!-- 主体区域 -->
        <el-main>
            <div class="mainTop">
                <h2 class="titleText">正在热映
                </h2>
                <div style="font-size: 12px;margin: 6px 10px;position: absolute;left: 90px;">共x部热映电影</div>
                <!-- 分页选择框 -->
                <el-pagination size="small" background layout="prev, pager, next" :total="12" class="mt-4"
                    page-size="6" />
            </div>
            <div class="hotPictures">
                <div class="page_1">
                    <div>热映图片</div>
                    <div>热映图片</div>
                    <div>热映图片</div>
                    <div>热映图片</div>
                    <div>热映图片</div>
                    <div>热映图片</div>
                </div>

            </div>
            <div class="hotNews">
                <div class="hotNews_text">
                    <h2>热门资讯</h2>
                    <div style="font-size: 12px;color:grey;margin-top: 8px;">更多</div>
                </div>
                <div class="newsContent">
                    <div>新闻内容</div>
                    <div>新闻内容</div>
                </div>
            </div>
            <div class="popularCinemas">
                <h2>热门影院</h2>
                <div class="listOfTheaters">
                    <ol>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                    </ol>
                </div>
            </div>
            <div class="hotTeaser">
                <h2>热门预告</h2>
                <div class="teaserContent">
                    <div></div>
                    <div></div>
                    <div></div>
                    <div></div>
                </div>
            </div>
            <div class="boxOfficeRankings">
                <h2>票房排行</h2>
                <div class="boxOffice">
                    <ol>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                        <li>xxxxxx影院</li>
                    </ol>
                </div>
            </div>
        </el-main>
        <!-- 足部区域 -->
        <el-footer>Footer</el-footer>
        <!-- 返回顶部 -->
        <el-backtop style="background-color: #D3DCE6    ;" :right="50" :bottom="100" />
    </el-container>
</template>

<script lang="ts">
export default {
    name: "Home"
}
</script>

<script setup lang="ts">
</script>



<style scoped>
@import '@/assets/home.css'
</style>
