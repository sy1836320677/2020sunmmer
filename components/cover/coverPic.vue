<template>
  <div>
    <el-carousel :interval="5000" type="card" height="600px">
      <el-carousel-item v-for="image in images" :key="image">
        <h3 class="medium"><el-image :src="image"></el-image></h3>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
export default {
  name: 'coverPic',
  data () {
    return {
      images: [
        'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1593835813731&di=1d0259f7fa80a9dd23f2a0bdb5402156&imgtype=0&src=http%3A%2F%2Fimg1.imgtn.bdimg.com%2Fit%2Fu%3D1604012991%2C515355833%26fm%3D214%26gp%3D0.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1593835801831&di=a3f4e2aead726f2d9c15989ac71e70ad&imgtype=0&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D2332335880%2C2565072723%26fm%3D214%26gp%3D0.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1593835929450&di=bd3d2fd53e452b194316d16cefa3f3e5&imgtype=0&src=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D1779114658%2C190534160%26fm%3D214%26gp%3D0.jpg']
    }
  }
}
</script>

<style scoped>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 200px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
</style>
