<template>
  <div class="home">
    <div>
      <v-btn class="btn" v-on:click="routeTo('about')">About</v-btn>
      <v-btn class="btn" v-on:click="routeTo('messenger')">Messenger</v-btn>
    </div>
  </div>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";

@Options({})
export default class Home extends Vue {
  public routeTo(route: string): void {
    this.$router.push(route);
  }
}
</script>

<style scoped>
.home {
  display: flex;
  flex-direction: column;
  align-items: center;
  align-content: center;
  vertical-align: center;
  justify-content: center;
  height: 100%;
}

.btn {
  margin: 1rem;
}
</style>
