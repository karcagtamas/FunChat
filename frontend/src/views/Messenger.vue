<template>
  <div class="messenger">
    <div class="message-panel"></div>
  </div>
</template>

<script>
import { Options, Vue } from "vue-class-component";

@Options({
  components: {},
})
export default class Messenger extends Vue {}
</script>

<style scoped>
.messenger {
  display: flex;
  flex-direction: column;
}
</style>
